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
package andy;

/**
 *
 * @author Andrea V.
 */
public class Animal {

    public String gender;
    Boolean wantsToPoop = false;
    public int age = 0;

    boolean isMammal() {
        return true;
    }

    public Integer mates() {
        return 1;
    }

    String toString2() {
        return "";
    }

    public void comer(String comida) {
        System.out.println("Soy un animal y estoy comiendo: " + comida);
    }

    public void poop() {
        if (wantsToPoop == true) {
            System.out.println("soy un animal y estoy cagando...");
        } else {
            System.out.println("ppujando.. pero no sale nada...FFFUUUUAAAA");
        }
    }

}
