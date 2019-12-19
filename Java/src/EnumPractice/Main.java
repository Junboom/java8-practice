package EnumPractice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (DownloadState value : DownloadState.values()) {
            System.out.println(value.getDescription());
        }
        Arrays.stream(DownloadState.values())
                .map(DownloadState::getDescription)
                .forEach(System.out::println);

        Main main = new Main();
        main.printDownloadStatus("READY");
    }

    public void printDownloadStatus(String name) {
        String foundStatus = Arrays.stream(DownloadState.values())
                .filter(d -> d.name().equalsIgnoreCase(name))
                .map(DownloadState::getDescription)
                .findAny()
                .orElseThrow(() -> new EnumConstantNotPresentException(DownloadState.class, name));
        System.out.println(foundStatus);
    }

}
