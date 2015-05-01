package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kourin.pear on 1/5/2558.
 */
@Entity
public class Image {
    @Id
    @GeneratedValue
    private Long id;

    String fileName;

    @Lob
    byte[] content;
    String contentType;

    @Temporal(TemporalType.TIME)
    Date created;

    public Image() {

    }

    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getContent() {
        return content;
    }

    public String getContentType() {
        return contentType;
    }

    public Date getCreated() {
        return created;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


}
