package bridge;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
    	InputView inputView = new InputView();
    	OutputView outputView = new OutputView();
		int bridgeSize = inputView.readBridgeSize();
		int count = 0;
		BridgeGame bridgeGame;

		BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
		BridgeMaker bridgeMaker = new BridgeMaker(bridgeRandomNumberGenerator);
		List<String> moving = bridgeMaker.makeBridge(bridgeSize);
			
		while(true) {
			count++;
			bridgeGame = new BridgeGame();
			bridgeGame.move(moving);
			if(bridgeGame.getSuccessOrNot())
				break;
			
			if(!bridgeGame.retry(inputView.readGameCommand()))
				break;
		}
		
		outputView.printResult(bridgeGame,bridgeGame.getSuccessOrNot(),count);
		return;
		
    }
}
