/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;


import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class JoseFernandoCabreraGarcia_201020955 {

    @Test
    public void test_asignarHorario_generarHorario1() throws Exception {
        // Arrange
        AsignarHorario asignarHorario = new AsignarHorario();
        Horario horario = new Horario();
        Carrera carreraMock = mock(Carrera.class);
        RegistroAcademico registroAcademicoMock = mock(RegistroAcademico.class);
        when(registroAcademicoMock.cheequearCarnet()).thenReturn(true);
        when(carreraMock.procesarCarrera()).thenReturn(2);
        when(registroAcademicoMock.getAnio()).thenReturn(2010);
        // Act
        horario = asignarHorario.generarHorario(carreraMock,registroAcademicoMock);
        // Assert
        Assert.assertNotNull(horario);
        // Will throw
    }

    @Test(expected = Exception.class)
    public void test_asignarHorario_generarHorario2() throws Exception {
        // Arrange
        AsignarHorario asignarHorario = new AsignarHorario();
        Horario horario = new Horario();
        Carrera carreraMock = mock(Carrera.class);
        RegistroAcademico registroAcademicoMock = mock(RegistroAcademico.class);
        when(registroAcademicoMock.cheequearCarnet()).thenReturn(false);
        // Act
        asignarHorario.generarHorario(carreraMock,registroAcademicoMock);
        // Assert
        // Will throw Exception
    }
}
