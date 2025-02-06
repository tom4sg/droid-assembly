package gutierrez.ARMS;

import gutierrez.ENUMS.FootPad;
import gutierrez.ENUMS.Limb;
import gutierrez.ENUMS.Side;
import gutierrez.ENUMS.Status;

public class LeftArm extends Arm {
	
	private Status status;
	private Side side;
	private Limb upper;
	private Limb lower;
	private FootPad pad;

	public LeftArm() {
		super("LA-01");
		this.status = Status.ONLINE;
		this.side = Side.LEFT;
		this.upper = Limb.Upper;
		this.lower = Limb.Lower;
		this.pad = FootPad.LEFT_FOOT;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Limb getUpper() {
		return upper;
	}

	public void setUpper(Limb upper) {
		this.upper = upper;
	}

	public Limb getLower() {
		return lower;
	}

	public void setLower(Limb lower) {
		this.lower = lower;
	}

	public FootPad getPad() {
		return pad;
	}

	public void setPad(FootPad pad) {
		this.pad = pad;
	}

	@Override
	public boolean armCheck() {
		if(status == Status.ONLINE) {
		return true;
		}
		else {
			return false;
		}
	}

}
