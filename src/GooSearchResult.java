class GooSearchResult {
    private String url;
    GooSearchResult(String url){
            this.url = url;

    }

    public String getUrl() {
        return url;
    }

    public String parseDomain(){
        String domain = "";

       String s = url.replace("https://", "").replace("http://", "");
       String []ss = new String[2];
        ss = s.split("/");
        domain = ss[0];

        return domain;
    }
}




class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}