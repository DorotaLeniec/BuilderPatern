package builder_pattern;

import java.io.BufferedReader;

/**
 * Created by RENT on 2017-08-08.
 */
public class Mail {
    private String content;
    private String sender;
    private String ipAddress;
    private String post;
    private String protocol;
    private MESSAGE_TYPE type;
    private boolean isCoded;
    private boolean isSpam;

    public Mail(Builder builder) {
        this.content = builder.content;
        this.sender = builder.sender;
        this.ipAddress = builder.ipAddress;
        this.post = builder.post;
        this.protocol = builder.protocol;
        this.type = builder.type;
        this.isCoded = builder.isCoded;
        this.isSpam = builder.isSpam;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public MESSAGE_TYPE getType() {
        return type;
    }

    public void setType(MESSAGE_TYPE type) {
        this.type = type;
    }

    public boolean isCoded() {
        return isCoded;
    }

    public void setCoded(boolean coded) {
        isCoded = coded;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public void setSpam(boolean spam) {
        isSpam = spam;
    }

    public static class Builder{
        private String content;
        private String sender;
        private String ipAddress;
        private String post;
        private String protocol;
        private MESSAGE_TYPE type;
        private boolean isCoded;
        private boolean isSpam;

        public Builder(){

        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setPost(String post) {
            this.post = post;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setType(MESSAGE_TYPE type) {
            this.type = type;
            return this;
        }

        public Builder setCoded(boolean coded) {
            isCoded = coded;
            return this;
        }

        public Builder setSpam(boolean spam) {
            isSpam = spam;
            return this;
        }

        public Mail create(){
            return new Mail(this);
        }
    }
}
