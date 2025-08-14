import java.util.Date;

public class Document {
    private String content;
    private Date lastModified;

    public Document(String content) {
        this.content = content;
        this.lastModified = new Date();
    }

    public String getContent() {
        return content;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public DocumentSaver save() {
        return new DocumentSaver(content);
    }

    public void load(DocumentSaver documentSaver) {
        this.content = documentSaver.getContent();
        this.lastModified = documentSaver.getLastModified();
    }

    public void setContent(String content) {
        this.content = content;
        this.lastModified = new Date();
    }
}
