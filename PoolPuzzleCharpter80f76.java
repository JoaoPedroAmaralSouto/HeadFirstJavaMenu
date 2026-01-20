package Use_a_cabeca_Java;

public class PoolPuzzleCharpter80f76 extends PoolPuzzleCharpter8Clowns {
    public static void execute(){
        PoolPUzzleCharpter8Nose[] i = new PoolPUzzleCharpter8Nose[3];
        i[0] = new PoolPuzzleCharpter8Acts();
        i[1] = new PoolPuzzleCharpter8Clowns();
        i[2] = new PoolPuzzleCharpter80f76();
        for (PoolPUzzleCharpter8Nose poolPUzzleCharpter8Nose : i) {
            System.out.println(poolPUzzleCharpter8Nose.iMethod()
                    + " " + poolPUzzleCharpter8Nose.getClass()
            );
        }
    }
}
