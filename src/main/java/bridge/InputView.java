package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
    	String input = Console.readLine();
    	if(input.matches("-?\\d+")) 
    		throw new IllegalArgumentException("[ERROR] 정수가 아닙니다.");
    	
    	int result = Integer.parseInt(input);
    	if(result<3||20<result)
    		throw new IllegalArgumentException("[ERROR] 3~20 사이의 숫자가 아닙니다.");
    	
        return result;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
