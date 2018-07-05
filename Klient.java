public class Klient {

    private Konto[] Konta;

    Konto(int value) {
        kontaList = new Konta[value];
    }

    void addMovie(Konta konta, int index) {
        kontaList[index] = konta;
    }

    public void showStore() {
        for (int i = 0; i < kontaList.length; i++) {
            kontaList[i].showKonto();
            System.out.println();
        }
    }

    public boolean checkExist(String title) {
        for (int i = 0; i < kontaList.length; i++) {
            if (kontaList[i].checkTitle(title)) {
                return true;
            }
        }
        return false;
    }

    public int idExist(String title) {
        for (int i = 0; i < kontaList.length; i++) {
            if (kontaList[i].checkTitle(title)) {
                return i;
            }
        }
        return -1;
    }

    public void KontaRent(String title) {
        int index = idExist(title);
        if (index != -1) {
            if (kontaList[index].checkAvailability()) {
                System.out.println("Brak podanego numeru !.");
            } else {
                kontaList[index].rent();
                kontaList[index].showKonto();
            }
        } else {
            System.out.println("Niestety, wybrana kwota jest niedostepna");
        }
    }

    public void returnMovie(String title) {
        int index = idExist(title);
        if (index != -1) {
            moviesList[index].giveBack();
        } else {
            System.out.println("Niestety, takiego rachunku nie obslugujemy!");
        }
    }

}