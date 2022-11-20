package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private List<String> upBridge;
    private List<String> downBridge;
    private int moveCount;
    private int gameCount;

    BridgeGame(){
        upBridge = new ArrayList<>();
        downBridge = new ArrayList<>();
        moveCount = 0;
        gameCount = 0;
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(List<String> answerBrige, String userCommand) {
        moveCount++;
        if(userCommand.equals(answerBrige.get(moveCount))){
            if(userCommand.equals("U")){
                upBridge.add("O");
                downBridge.add(" ");
            }else{
                upBridge.add(" ");
                downBridge.add("O");
            }
            return true;
        }
        if(userCommand.equals("U")){
            upBridge.add("X");
            downBridge.add(" ");
        }else{
            upBridge.add(" ");
            downBridge.add("X");
        }
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        upBridge.clear();
        downBridge.clear();
        moveCount = 0;
        gameCount +=1;
    }

    public boolean compareMoveCount(int brideSize){
        if(moveCount == brideSize){
            return true;
        }
        return false;
    }
}
