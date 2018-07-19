package Template;

public class TestPaperA extends TestPaper {
    @Override
    public String answer1(){
        return "A" ;
    }
    public String answer2(){
        return "B";
    }
    public String answer3(){
        return "C" ;
    }
}

class TestPaperB extends TestPaper{
    public String answer1(){
        return "c" ;
    }
    public String answer2(){
        return "B";
    }
    public String answer3(){
        return "A" ;
    }
}
