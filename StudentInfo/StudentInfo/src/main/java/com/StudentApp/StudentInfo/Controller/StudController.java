package com.StudentApp.StudentInfo.Controller;

import com.StudentApp.StudentInfo.Model.StudentModel;
import com.StudentApp.StudentInfo.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Component
@RestController
public class StudController {

    @Autowired
    private StudService studService;
    @GetMapping("/displayAllData")
    public List<StudentModel> displayAllData()
    {
        return studService.DisplayAllData();
    }
    //----------------------------------------------------------------------------------

    @PostMapping("/addData")
    public String addData(StudentModel s)
    {
        return studService.addData(s);
    }
    //---------------------------------------------------------------------------------
    @GetMapping("/displayMaxMarksInPerSub/{sub}")
    public List<StudentModel> displayMaxMarksInPerSub(@PathVariable String sub)
    {
        return studService.displayMaxMarksInPerSub(sub);
    }
    //---------------------------------------------------------------------------------
    @GetMapping("/displayPercentage")
    public String displayPercentage(@RequestParam int rollNo, long contNo)
    {
        return studService.displayPercentage(rollNo,contNo);
    }
    //----------------------------------------------------------------------------------

    @GetMapping("/displayNamesStartWithAAndEndWithH")
    public Set<String> displayNamesStartWithAAndEndWithH(@RequestParam String sCh1, String sCh2)
    {
        return studService.displayNamesStartWithAAndEndWithH(sCh1, sCh2);
    }
    //----------------------------------------------------------------------------------

    @PutMapping("/give10MarksExtraToThoseStudWhoHasMarksBetween35T045/{sub}")
    public String  give10MarksExtraToThoseStudWhoHasMarksBetween35T045(@PathVariable String sub)
    {
        return studService.give10MarksExtraToThoseStudWhoHasMarksBetween35T045(sub);
    }
}
