package SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Service;

import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Model.Note;
import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NoteService implements NoteServices {
    @Autowired
    private NoteRepository repository;

    @Override
    public List<Note> getAllNotes() {

        return repository.findAll();
    }

    @Override
    public void saveNote(Note n1) {

        this.repository.save(n1);

    }

    @Override
    public Note getNoteById(int id) {
        Optional<Note> optional = repository.findById(id);
        Note note = null;
        if (optional.isPresent()) {
            note = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id :" + id);
        }
        return note;
    }

    @Override
    public void deleteNote(int id) {

        this.repository.deleteById(id);
    }
}