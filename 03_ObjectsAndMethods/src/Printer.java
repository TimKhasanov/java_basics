public class Printer {
    private String queue = "";
    private int pagesCount = 3;
    private int documentCount = 0;

    private static int printedPagesCount = 0;
    private static int printedDocumentCount = 0;


    public void append(String text) {
        append(text, "", 1);

    }
    public void append(String text, String documentName){
        append(text, documentName, 1);

    }
    public void append(String text, String documentName,int numberOfPages){
        pagesCount += numberOfPages;
        documentCount++;
        queue += documentName + "-" + text + "-" + "pagesCount" + numberOfPages + "\n";
    }
    public void clear(){
        queue = "";
        pagesCount = 0;
        documentCount = 0;
    }
    public void print(){
        System.out.print(queue);
        System.out.println("Print completed" +"\n" );
        printedPagesCount += pagesCount;
        printedDocumentCount += documentCount;
        clear();
    }
    public int getPagesCount(){
        return pagesCount;
    }
    public int getDocumentCount(){
        return documentCount;
    }
    public void totalPrintedPagesAndDocs(){
        System.out.println("Printed documents:" + printedDocumentCount + "\n" + "Printed pages" + printedPagesCount + "\n");
    }


}
