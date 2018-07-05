public class Osczednosciowe {
    class Klasa
    {
        static int liczbaObiektow = 0;

        Klasa()
        {
            liczbaObiektow++;
        }

        static int getLiczbaObiektow ()
        {
            return liczbaObiektow;
        }
    }
}
