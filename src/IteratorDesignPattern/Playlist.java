package IteratorDesignPattern;

import java.util.*;


public class Playlist implements  Iterable<Song>  {
    private final List<Song> songs = new ArrayList<Song>();
    private  PlaybackMode mode=PlaybackMode.STANDARD;

    public void addSong(Song song){
          songs.add(song);
    }
    public void setMode(PlaybackMode mode){
        this.mode=mode;
    }
    @Override
    public Iterator<Song> iterator(){
        return switch (mode) {
            case STANDARD -> new StandardIterator();
            case SHUFFLE -> new ShuffleIterator();
            case FAVORITES_ONLY -> new FavoritesIterator();
        };
    }
    private class StandardIterator implements  Iterator<Song>{
        int index=0;

        @Override
        public boolean hasNext() {
            return index<songs.size();
        }

        @Override
        public Song next() {
            if(!hasNext())
                throw new NoSuchElementException("No more songs");
            return songs.get(index++);
        }
    }
    private class ShuffleIterator implements  Iterator<Song>{
        int index=0;
        private final List<Song>shuffledSong;

        ShuffleIterator(){
            shuffledSong=new ArrayList<Song>(songs);
            Collections.shuffle(shuffledSong);
        }
        @Override
        public boolean hasNext() {
            return index<shuffledSong.size();
        }

        @Override
        public Song next() {
            if(!hasNext())
                throw new NoSuchElementException("No more songs");
            return shuffledSong.get(index++);
        }
    }
    private class FavoritesIterator implements  Iterator<Song>{
        int index=0;
        FavoritesIterator(){
            findNext();
        }
        private void findNext(){
            while(index<songs.size()&&!songs.get(index).isFavorite())index++;
        }
        @Override
        public boolean hasNext() {
            return index<songs.size();
        }

        @Override
        public Song next() {
            if(!hasNext())
                throw new NoSuchElementException("No more songs");
            Song sng=songs.get(index++);
            findNext();
            return sng;
        }
    }
}
