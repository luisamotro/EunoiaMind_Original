package cl.generation.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.generation.web.models.Emocion;
import cl.generation.web.repositories.EmocionRepository;


@Service
public class EmocionServiceImpl implements EmocionService{

	@Autowired 
	private EmocionRepository emocionRepository;
	 
	@Override
	public Emocion guardarEmocion (Emocion emocion) {
		return emocionRepository.save(emocion);
	}
	
	
	
	
	
	
}
