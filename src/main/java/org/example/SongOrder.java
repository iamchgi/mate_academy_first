package org.example;

/**
 * Make possible initialization using static factory methods.
 * See requirements in task description.
 */
public class SongOrder {
    private String singer;
    private String songName;


    private SongOrder(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }

    public static SongOrder of(String singer, String songName) {
        return new SongOrder(singer, songName);
    }

    public static SongOrder of(String singer) {
        return new SongOrder(singer, null);
    }

    public static SongOrder of() {
        return new SongOrder(null, null);
    }

    @Override
    public String toString() {
        if (singer != null & songName != null) {
         return   "Play " + singer + " song called \"" + songName + "\"";
        }
        if (singer != null & songName == null) {
            return   "Play any " + singer + " song";
        }
        if (singer != null &  songName != null) {
            return   "You haven't chosen a singer. Please make your choice)";
        }
        return "";
    }
}
