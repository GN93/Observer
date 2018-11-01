package com.gn93;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    public void playFirstTrack(){
        System.out.println("Playing first track: " + tracks.get(0));
    }

    public void playNextTrack(){
        currentTrackNumber++;
        try{
            if(currentTrackNumber > tracks.size()-1){
                currentTrackNumber = 0;
                System.out.println("There are no more tracks. Playing first one:" + tracks.get(currentTrackNumber));
            }
            else{
                System.out.println("Next track is:" + tracks.get(currentTrackNumber));
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Track number" + currentTrackNumber + " is out of band! Number of tracks is" + tracks.size());
        }
    }

    public void playRandomTrack(){
        System.out.println("Playing random track:" + tracks.get(new Random().nextInt(tracks.size()-1)));
    }
}
