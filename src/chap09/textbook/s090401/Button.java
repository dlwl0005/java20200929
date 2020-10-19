package chap09.textbook.s090401;

public class Button {
	OnClickListner listener;
	
	void setOnClickListner(OnClickListner listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	interface OnClickListner{
		void onClick();
	}

}
