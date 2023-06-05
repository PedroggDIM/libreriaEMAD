package es.mdef.proyecto_biblioteca_emad_libreria;

import java.util.Date;
import java.util.List;

public interface Documento {

	// Un documento tiene muchos préstamos
	List<Prestamo> getPrestamos();

	// Getters y Setters de la clase
	
    Categoria getCategoria();
	
	Long getId();
	
	String getTitulo();

	String getAutor();

	String getSinopsis();

	int getEstanteria();

	Date getFechaAlta();

	boolean isDisponible();

	int getNumCopias();

}