package SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Repository;

import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Model.Note;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note,Integer>
{
       /* @Query("update Note n set n.noteId=n.noteId-1 where n.noteId > :id")
        @Modifying
        @Transactional
        public void deleteNotes(@Param("id") int id);*/
}
