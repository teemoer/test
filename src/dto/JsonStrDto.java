package dto;

import java.util.List;

public class JsonStrDto {

    /**
     * status : 0
     * errorCode :
     * data : [{"page":1,"hash":"a0db8b27"},{"page":2,"hash":"be082eec"}]
     */

    private int status;
    private String errorCode;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * page : 1
         * hash : a0db8b27
         */

        private int page;
        private String hash;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }
    }
}
