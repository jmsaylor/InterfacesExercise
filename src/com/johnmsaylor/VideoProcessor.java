package com.johnmsaylor;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private CommunicationService communicate;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, CommunicationService communicate) {
        this.encoder = encoder;
        this.database = database;
        this.communicate = communicate;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        communicate.sendEmail(video.getUser());
    }
}

