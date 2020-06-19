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

/**
 *
 * @author Andrea V.
 */
public class Mama {

    String nombre;
    Daughter daughter;
    

}

class Daughter {

    String nombre;
    Mama mama;
   
    Daughter(){}
    
    Daughter(Mama myMom){
        this.mama = myMom;
    }
    

}
