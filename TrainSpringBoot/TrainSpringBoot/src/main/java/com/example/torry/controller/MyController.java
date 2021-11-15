package com.example.torry.controller;


import com.example.torry.model.Train;
import com.example.torry.repository.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @Autowired
    MyRepo repo;

    @RequestMapping("index")
    public String in()
    {
        return "login.jsp";
    }

    @RequestMapping("availabletrains")
    public String availableTrains()
    {
        return "availabletrains.jsp";
    }

    @RequestMapping("signup")
    public String signup()
    {
        return "signup.jsp";
    }

    @RequestMapping("booktrain")
    public String booktrain()
    {
        return "booktrain.jsp";
    }

    @RequestMapping("added")
    public ModelAndView newTrainNo(@RequestParam int trainNo){
        System.out.println(trainNo);
        ModelAndView m1 = new ModelAndView("noofpassanger.jsp");
        Train train = repo.findById(trainNo).orElse(new Train());
        m1.addObject(train);
        System.out.println(train);
        return m1;
    }

    @RequestMapping("addpassangers")
    public String addingPass(@RequestParam int noofpassangers){
        System.out.println(noofpassangers);
        return "GeneratedTicket.jsp";
    }

   /* @RequestMapping("add")
    public String add(Train tr){
        repo.save(tr);
        return "railway.jsp";
    }*/

    /*@RequestMapping("back")
    public String back()
    {
        return "railway.jsp";
    }

    @RequestMapping("get")
    public ModelAndView get(@RequestParam int trainno)
    {
        ModelAndView mv=new ModelAndView("trainuserdetail.jsp");
        TrainDetail trains=repo.findById(trainno).orElse(new TrainDetail());
        mv.addObject(trains);
        return mv;
    }*/
}



