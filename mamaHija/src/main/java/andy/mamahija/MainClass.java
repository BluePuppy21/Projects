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
package andy.mamahija;

import andy.Animal;
import andy.Ave;
import andy.Can;
import andy.Pez;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Andrea V.
 */
public class MainClass {

    public static void main(String args[]) {

        animal();
//       mama();
    }

    /**
     * Andrea created this code
     */
    static void mama() {

        Mama mar = new Mama();
        Daughter andy = new Daughter(mar);

        andy.mama.nombre = "Marcela nnz ";
        andy.mama.daughter = andy;
        andy.nombre = "Andrea marcela";

        javax.swing.JOptionPane.showMessageDialog(null, andy.mama.nombre + andy.nombre);
        //Mama mar=andy.mama;
        Daughter hija2 = new Daughter();

    }

    static void animal() {

        Animal[] animalesOld = new Animal[6];
        //{new Ave(),new Ave(),new Can(),new Can(),new Pez(),new Pez()}
        animalesOld[0] = new Ave();
        animalesOld[1] = new Ave();
        animalesOld[2] = new Can();
        animalesOld[3] = new Can();
        animalesOld[4] = new Pez();
        animalesOld[5] = new Pez();

        Animal[] animales = agregarAnimal(animalesOld);

        for (Animal animal : animales) {
            animal.poop();
            System.out.println("FFFFFFFFFUUUUUUAAAAAAAA");
        }
    }

    static Animal[] agregarAnimal(Animal[] animal) {
        Animal[] animales = new Animal[animal.length + 1];
        animales[1] = animal[1];

        Animal animalas;
        for (int i = 0; i < animal.length; i++) {
            animalas = animal[i];

            animales[i] = animalas;
        }
        
        class Cheeta extends Animal{
            @Override
            public void poop(){
                System.out.println("Soy un Cheeta y estoy cagando...");
            }
        }
        
        animales[animales.length - 1] = new Cheeta();

        return animales;
    }

}
