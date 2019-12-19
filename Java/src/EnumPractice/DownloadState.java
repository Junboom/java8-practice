package EnumPractice;

public enum DownloadState {

    READY("준비", false),
    CREATED("파일 생성", true),
    ENABLE_DOWNLOAD("다운로드 가능", true),
    EXCEEDED("다운로드 횟수 초과", false);

    private String description;
    private boolean downloadable;

    DownloadState(String description, boolean downloadable) {
        this.description = description;
        this.downloadable = downloadable;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDownloadable() {
        if (downloadable)   return true;
        else                return false;
    }

}
