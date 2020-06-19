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

/**
 *
 * @author Andrea V.
 */
class Book {

    String title;
    String author;
    String genre;

    Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    Book(String title, String genre) {
        this.title = title;
        this.genre = genre;

    }

    @Override
     public String toString() {

         return  "Title: " + title + "\n" + "Author: " + author + "\n" + "Genre: " + genre;
    }
}
