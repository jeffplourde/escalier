package dds.time

object Duration {
	def apply(sec: Long, nsec: Long) = new Duration(sec, nsec)
	def infinite = new Duration(0x7fffffffL, 0x7fffffffL)
	def zero = new Duration(0, 0)
}

class Duration(val sec: Long, val nsec: Long) extends Ordered[Duration] {
	
	def compare(that: Duration): Int = {
		val dsec = if ((this.sec - that.sec) == 0) (this.nsec  - that.nsec) else (this.sec - that.sec)

		if (dsec > 0) 1
		else if (dsec == 0) 0
		else -1
	}
	
	
}