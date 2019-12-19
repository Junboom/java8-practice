package EnumPractice;

import java.util.EnumSet;

public enum DownloadState2 {

    READY("준비"),
    CREATED("파일 생성"),
    ENABLE_DOWNLOAD("다운로드 가능"),
    EXCEEDED("다운로드 횟수 초과");

    private String description;
    private static final EnumSet<DownloadState2> DOWNLOADABLE_STATUS = EnumSet.of(CREATED, ENABLE_DOWNLOAD);

    DownloadState2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDownloadable() {
        if (DOWNLOADABLE_STATUS.contains(this))
            return true;
        else
            return false;
    }

}
