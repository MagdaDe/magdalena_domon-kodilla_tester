public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2019, "Acer");
        System.out.println(notebook.weight + "g " + notebook.price + " USD " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceToYear();
        String notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);
        int notebookWeight2 = notebook.getWeight2();
        System.out.println(notebookWeight2);
        String notebookName = notebook.getName();
        System.out.println(notebookName);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015, "Lenovo");
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + " USD " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceToYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2012, "HP");
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " USD " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceToYear();

        Notebook officeNotebook = new Notebook(2100, 2000, 2018, "IBM");
        System.out.println(officeNotebook.weight + "g " + officeNotebook.price + " USD " + officeNotebook.year);
        officeNotebook.checkPrice();
        officeNotebook.checkWeight();
        officeNotebook.checkPriceToYear();

        Notebook netbook = new Notebook(500, 400, 2010, "Mac");
        System.out.println(netbook.weight + "g " + netbook.price + " USD " + netbook.year);
        netbook.checkPrice();
        netbook.checkWeight();
        netbook.checkPriceToYear();

        Notebook secondHandNotebook = new Notebook(2000, 1000, 2010, "Lenovo");
        System.out.println(secondHandNotebook.weight + "g " + secondHandNotebook.price + " USD " + secondHandNotebook.year);
        secondHandNotebook.checkPrice();
        secondHandNotebook.checkWeight();
        secondHandNotebook.checkPriceToYear();

        Notebook afterLeaseNotebook = new Notebook(1500, 500, 2016, "IBM");
        System.out.println(afterLeaseNotebook.weight + "g " + afterLeaseNotebook.price + " USD " + afterLeaseNotebook.year);
        afterLeaseNotebook.checkPrice();
        afterLeaseNotebook.checkWeight();
        afterLeaseNotebook.checkPriceToYear();
    }
}