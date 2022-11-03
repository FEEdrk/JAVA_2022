package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}


	@Override
	public void add(Language language) throws Exception {
		
		if(language.getName().isEmpty()) {
			throw new Exception("Name cannot be left blank!");
		}
		else if(!this.isValid(language)){
			throw new Exception("This language is available!");
		}
		else {
			languageRepository.add(language);
		}
		
	}


	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}


	@Override
	public void update(Language language, int id) {
		languageRepository.update(language, id);
		
	}


	@Override
	public Language getById(int Id) {

		return languageRepository.getById(Id);
	}


	@Override
	public boolean isValid(Language language) {
		for(Language language1: getAll()) {
			if(language1.getName().equalsIgnoreCase(language.getName())) {
				return false;
			}
		}

		
		return true;
	}
	
	
	
	
	

}
