
/*
/*
 * Copyright (C) 2020 Andrea V.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mainbookstore;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Andrea V.
 */
class MainBookStore {

    /*public static void main(String[] args) {
        
        //oldProcedure();
    }*/

    private static void oldProcedure() {
        Book[] a = {new Book("A Dogs Purpose", "W. Bruce Cameron", "Action And Sad"),
            new Book("Gamer Army", "Trent Reedy", "action And Adventure"),
            new Book("Ps.I miss you", "Jen Petro-Roy", "Sad And Moving"),
            makeABook()};
        print2(a);
    }

    static Book makeABook() {
        String a = showInputDialog("Title goes here");
        String b = showInputDialog("Author goes here");
        String c = showInputDialog("Genre goes here");
        Book d = new Book(a, b, c);

        return d;
    }

    static void print2(Book[] theBook) {
        for (int i = 0; i < theBook.length; i++) {
            showMessageDialog(null, theBook[i]);
        }
    }

}
