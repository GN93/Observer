package com.gn93.command;

import com.gn93.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
