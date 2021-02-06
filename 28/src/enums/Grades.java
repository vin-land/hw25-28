package enums;

public enum Grades {
    JUNIOR("I am super-junior developer!"),
    MIDDLE("I am serious Middle developer."),
    SENIOR("I am Senior developer."),
    TEAMLEAD("I am awesome Teamlead!");

    private String phrase;
    Grades(String phrase){this.phrase=phrase;}

    public String getPhrase() {
        return phrase;
    }

    public void printPhrase(){
        System.out.println(getPhrase());
    }

}
