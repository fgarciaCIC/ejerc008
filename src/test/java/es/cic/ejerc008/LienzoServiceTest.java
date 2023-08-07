package es.cic.ejerc008;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import es.cic.ejerc008.DTO.FiguraCompletaDTO;
import es.cic.ejerc008.DTO.LienzoDTO;
import es.cic.ejerc008.Entity.Figura;
import es.cic.ejerc008.Entity.Lienzo;
import es.cic.ejerc008.Repository.FiguraRepository;
import es.cic.ejerc008.Repository.LienzoRepository;
import es.cic.ejerc008.Service.LienzoService;
import es.cic.ejerc008.assembler.FiguraAssembler;

@RunWith(MockitoJUnitRunner.class)
public class LienzoServiceTest {
	  @InjectMocks
	    private LienzoService lienzoService;

	    @Mock
	    private LienzoRepository lienzoRepository;

	    @Mock
	    private FiguraRepository figuraRepository;

	    @Mock
	    private FiguraAssembler figuraAssembler;
	    
	    @BeforeEach
	    public void setUp() {
	        MockitoAnnotations.initMocks(this);
	    }


	    @Test
	    public void testAgregarFiguraALienzo() {
	        Long lienzoId = 1L;

	        // Inicializar figuraDTO con datos de prueba
	        FiguraCompletaDTO figuraCompletaDTO = new FiguraCompletaDTO();
	        figuraCompletaDTO.setId(1L);
	        figuraCompletaDTO.setTipoFigura("Circulo");
	        figuraCompletaDTO.setPosicionX(50);
	        figuraCompletaDTO.setPosicionY(50);
	        figuraCompletaDTO.setColor("Rojo");

	        // Inicializar lienzo con datos de prueba
	        Lienzo lienzo = new Lienzo();
	        lienzo.setId(lienzoId);
	     //   lienzo.setMaxX(800);
	       // lienzo.setMaxY(600);
	     
	        // Inicializar figura con datos de prueba
	        Figura figura = new Figura(null, 0, 0, null);
	        figura.setId(2L);
	        figura.setTipoFigura("Cuadrado");
	        figura.setPosicionX(100);
	        figura.setPosicionY(200);
	        figura.setColor("Azul");

	        // Mockear el resultado del método toEntity del figuraAssembler	    
	    //    when(figuraAssembler.toEntity(figuraCompletaDTO)).thenReturn(figura);
	    //   verify(figuraAssembler, times(1)).toEntity(figuraCompletaDTO);
 	        
	     // Configuración de mocks
	        when(lienzoRepository.findById(lienzoId)).thenReturn(Optional.of(lienzo));	        
	        when(lienzoRepository.save(any(Lienzo.class))).thenReturn(lienzo);

	         lienzoService.agregarFiguraALienzo(lienzoId, figuraCompletaDTO);

	        verify(lienzoRepository, times(1)).findById(lienzoId);
	    
	        verify(lienzoRepository, times(1)).save(lienzo);
	    }
}
