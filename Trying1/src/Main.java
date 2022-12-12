public class Main {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = false;
        boolean isPersonnel = true;

        String message = passIsValid && !inCarantine ?
        "Проход открыт" : (isPersonnel? "проход только для персонала" :
        "Проход закрыт");
        }
    }

