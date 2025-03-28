package org.example;


import org.example.Model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ModelDueño dueño1 = new ModelDueño(1,"Luis","Andres","16 Calle","37086015","adres@gmail.com");
        ModelMascota mascota1 = new ModelMascota(1,"Firulas","Perro","Labrador",new Date(),25.5,'M',dueño1);
        ModelVeterinario veterinario1 = new ModelVeterinario(1,"Juan","Perez","General","980701","L-V 9-1");

        ModelCita cita1 = new ModelCita(1,new Date(),mascota1,dueño1,veterinario1,"Chequeo anual");
        //System.out.println("Cita Creada de manera correcta: "+cita1.getIdCita()+ "-Estado" +cita1.getEstado());


        ModelConsulta consulta1 = new ModelConsulta(1, new Date(), mascota1, veterinario1, "Chequeo anual","Saludable","Nigunor",100);
        consulta1.setDiagnostico("Saludable");
        consulta1.setTratamiento("Ninguno requerido");
        System.out.println("Consulta realizada. Costo: $" + consulta1.getCosto());






    }
}