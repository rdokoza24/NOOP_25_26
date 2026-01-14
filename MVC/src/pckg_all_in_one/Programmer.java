package pckg_all_in_one;

import java.util.List;

public class Programmer {

    private String username;
    private String email;
    private ProgammingLangEnum lang;
    private String level;
    private String workingTime;
    private List<String> additionalInfo;

    public Programmer(String username, String email, ProgammingLangEnum lang, String level, String workingTime, List<String> additionalInfo) {
        this.username = username;
        this.email = email;
        this.lang = lang;
        this.level = level;
        this.workingTime = workingTime;
        this.additionalInfo = additionalInfo;

    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public ProgammingLangEnum getLang() {
        return lang;
    }

    public String getLevel() {
        return level;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public List<String> getAdditionalInfo() {
        return additionalInfo;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", lang=" + lang +
                ", level='" + level + '\'' +
                ", workingTime='" + workingTime + '\'' +
                ", additionalInfo=" + additionalInfo +
                '}';
    }
}
