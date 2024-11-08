public class Main {
    public static void main(String[] args) {
        SpotifyVo list = new SpotifyVo();

        list.add("Wind of Change", "Scorpions", 1990, 5, 10);
        list.add("Still Loving You", "Scorpions", 1984, 6, 26);
        list.add("Rock You Like a Hurricane", "Scorpions", 1984, 4, 12);
        list.add("Holiday", "Scorpions", 1979, 6, 32);

        list.add("The Final Countdown", "Europe", 1986, 5, 9);
        list.add("Carrie", "Europe", 1986, 4, 32);
        list.add("Rock the Night", "Europe", 1985, 4, 4);
        list.add("Superstitious", "Europe", 1988, 4, 35);

        list.add("Forever and One", "Helloween", 1996, 3, 54);
        list.add("I Want Out", "Helloween", 1988, 4, 41);
        list.add("Eagle Fly Free", "Helloween", 1988, 5, 8);
        list.add("A Tale That Wasn't Right", "Helloween", 1987, 4, 42);

        list.add("Zombie", "The Cranberries", 1994, 5, 6);
        list.add("Linger", "The Cranberries", 1993, 4, 34);
        list.add("Dreams", "The Cranberries", 1993, 4, 15);
        list.add("Ode to My Family", "The Cranberries", 1994, 4, 32);

        list.add("She's Gone", "Steelheart", 1990, 5, 52);
        list.add("I'll Never Let You Go", "Steelheart", 1990, 5, 6);
        list.add("Everybody Loves Eileen", "Steelheart", 1990, 5, 10);

        list.add("Sweet Child O' Mine", "Guns N' Roses", 1987, 5, 56);
        list.add("November Rain", "Guns N' Roses", 1991, 8, 57);
        list.add("Paradise City", "Guns N' Roses", 1988, 6, 46);
        list.add("Patience", "Guns N' Roses", 1989, 5, 56);

        list.add("Livin' on a Prayer", "Bon Jovi", 1986, 4, 9);
        list.add("You Give Love a Bad Name", "Bon Jovi", 1986, 3, 42);
        list.add("Always", "Bon Jovi", 1994, 5, 53);
        list.add("Wanted Dead or Alive", "Bon Jovi", 1986, 5, 9);

        list.add("With or Without You", "U2", 1987, 4, 56);
        list.add("One", "U2", 1991, 4, 36);
        list.add("Sunday Bloody Sunday", "U2", 1983, 4, 40);
        list.add("Pride (In the Name of Love)", "U2", 1984, 3, 48);

        list.add("I Want to Break Free", "Queen", 1984, 3, 43);
        list.add("Radio Ga Ga", "Queen", 1984, 5, 49);
        list.add("A Kind of Magic", "Queen", 1986, 4, 24);
        list.add("Under Pressure", "Queen & David Bowie", 1981, 4, 8);

        list.add("Here I Go Again", "Whitesnake", 1982, 5, 9);
        list.add("Is This Love", "Whitesnake", 1987, 4, 43);
        list.add("Fool for Your Loving", "Whitesnake", 1980, 4, 12);
        list.add("Still of the Night", "Whitesnake", 1987, 6, 38);

        list.add("Every Breath You Take", "The Police", 1983, 4, 13);
        list.add("Roxanne", "The Police", 1978, 3, 12);
        list.add("Message in a Bottle", "The Police", 1979, 4, 51);
        list.add("Don't Stand So Close to Me", "The Police", 1980, 4, 3);

        list.add("Another One Bites the Dust", "Queen", 1980, 3, 35);
        list.add("Take on Me", "A-ha", 1985, 3, 46);
        list.add("Africa", "Toto", 1982, 4, 55);
        list.add("Eye of the Tiger", "Survivor", 1982, 4, 4);

        list.add("Alone", "Heart", 1987, 3, 39);
        list.add("I Want to Know What Love Is", "Foreigner", 1984, 5, 4);
        list.add("Jump", "Van Halen", 1984, 4, 4);
        list.add("Beat It", "Michael Jackson", 1982, 4, 18);

        list.display();
        System.out.println();

        System.out.println("Sort By Duration:");
        list.asc();
        list.display();
        System.out.println();

        System.out.println("Sort By Year:");
        list.desc();
        list.display();
        System.out.println();

        list.linearSearch("The Final Countdown");
    }
}
