class ComplexNum {
    
	double re;
	double im;

    void build(double re, double im) {
        this.re = re;
		this.im = im;
		
    }

    boolean equal(ComplexNum num) {
        if ( this.im == num.im && this.re == num.re)
		{
			return true;
		}
        return false;
    }

    void add(ComplexNum num) {
		
		this.re = this.re + num.re;
        this.im = this.im + num.im;
    }

    String toStringRep() {
        
		if( this.im == 0 )
		{
			System.out.println(this.re);
		}
		else if(this.re == 0)
		{
			System.out.println(this.im + "i");
		}
		else if (this.im > 0)
		{
			System.out.println(this.re + "+" + this.im + "i");
		}
		else if (this.im < 0)
		{
			System.out.println(this.re + "" + this.im + "i");
		}
		
        return "";
    }
}