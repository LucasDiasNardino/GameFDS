package pucrs;


public class AdapterTest {
    
        @BeforeEach
        public void init(){
            Adapter Adapter = new Adapter();
            Adapter.add(Position.First, "A");
            Adapter.add(Position.Last, "b");
            Adapter.add(Position.First, "C");
        }
        
        
        
}
