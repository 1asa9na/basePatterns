import java.util.Date;

public class DocumentSaver {
    private String content;
    private Date lastModified;

    public DocumentSaver(String content) {
        this.content = content;
        this.lastModified = new Date();
    }

    public String getContent() {
        return content;
    }

    public Date getLastModified() {
        return lastModified;
    }
}
