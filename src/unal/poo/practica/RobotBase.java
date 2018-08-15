package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
            
            /*Field 1
            estudiante = new Robot(objetos,0, 2, Direction.WETS,10);
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            */
            
            /*Field 2
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            for(int i=0;i<=2;i++){
                estudiante.turnLeft();
            }
            for(int i=0;i<=2;i++){
                estudiante.move();
                estudiante.turnLeft();
            }
            estudiante.turnLeft();
            for(int i=0;i<=2;i++){
                estudiante.move();
                for(int j=0;j<=2;j++){
                    estudiante.turnLeft();
                }
            }*/
            
            //Field 3
            estudiante.move();
            if(estudiante.canPickThing()==true){
                estudiante.pickThing();
            }
             for(int j=1;j<=3;j++){
                 estudiante.turnLeft();
            }
            estudiante.countThingsInBackpack();
            int n = estudiante.countThingsInBackpack();
            for(int j=1;j<=n;j++){
                estudiante.putThing();
                estudiante.move();
                }
            }
            
	
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++)
                estudiante.move();
        }
}

