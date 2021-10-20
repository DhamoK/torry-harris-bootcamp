package com.torry.drive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicSystem {

    @Autowired
    //@Qualifier("s")
    Speaker speaker;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
    public void typeOfMusicSystem(){
        System.out.println("DOLBY ATMOS");
        speaker.nameOfSpeaker();
    }
}
