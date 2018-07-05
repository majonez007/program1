

public class Main {

    public static void main(String[] args) {
        System.out.println("Menedzer konta bankowego " +
                "Projekt: " +
                "");
        System.out.println("Witaj w banku");
        System.out.print("Wybierz usluge: ");
        System.out.println("Oszczednosci");
        System.out.println("Ror");
        String csvFile = "src/konto.csv";
        String line = "";
        String cvsSplitBy = ";";


        try {
            long countOfLines = Files.lines(Paths.get(new File(csvFile).getPath())).count();

            Konto konto = new Konto((int) countOfLines - 1);

            br = new BufferedReader(new FileReader(csvFile));

            boolean pominPierwszaLinie = true;
            int czytanaLinia = 0;
            while ((line = br.readLine()) != null) {
                if (pominPierwszaLinie) {
                    pominPierwszaLinie = false;
                    continue;
                }

                String[] slowo = line.split(cvsSplitBy);

                Klient = new Klient(
                        slowo[0].trim(),
                        slowo[1].trim(),
                        slowo[2].trim(),
                        slowo[4].trim(),
                        Integer.parseInt(slowo[3].trim()),
                        Integer.parseInt(slowo[5].trim())
                );

                Ror.dodajKonto(konto, czytanaLinia);
                czytanaLinia++;

            }

            konto.wyswietlKonto();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
