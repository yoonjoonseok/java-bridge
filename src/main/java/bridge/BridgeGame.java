package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
	/**
	 * 사용자가 칸을 이동할 때 사용하는 메서드
	 * <p>
	 * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
	 */
	public String move(List<String> movings) {
		String result = null;
		InputView inputView = new InputView();
		OutputView outputView = new OutputView();
		
		for (int i = 0; i < movings.size() - 1; i++) {
			
			String moving = inputView.readMoving();
			if (!moving.equals(movings.get(i))) {
				outputView.printMap(movings,false);
				break;
			}
			outputView.printMap(movings,true);
		}
		return result;
	}

	/**
	 * 사용자가 게임을 다시 시도할 때 사용하는 메서드
	 * <p>
	 * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
	 */
	public boolean retry(String input) {
		boolean result = true;

		if (input.equals("R"))
			result = true;
		if (input.equals("Q"))
			result = false;

		return result;
	}
}
