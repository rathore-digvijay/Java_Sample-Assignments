/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshul-pc
 */
public class calculator extends javax.swing.JFrame {

    public calculator() {
        initComponents();
		getContentPane().setBackground(java.awt.Color.white);
		
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");

        p1.setBackground(new java.awt.Color(51, 255, 204));

        t1.setBackground(new java.awt.Color(0, 51, 51));
        t1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 255, 0));

        b1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 0, 255));
        b1.setText("CLEAR");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        b2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(153, 153, 0));
        b2.setText("7");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(153, 153, 0));
        b3.setText("8");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(153, 153, 0));
        b4.setText("9");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(153, 153, 0));
        b5.setText("/");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(153, 153, 0));
        b6.setText("4");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(153, 153, 0));
        b7.setText("5");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(153, 153, 0));
        b8.setText("6");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(153, 153, 0));
        b9.setText("*");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b10.setForeground(new java.awt.Color(153, 153, 0));
        b10.setText("1");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b11.setForeground(new java.awt.Color(153, 153, 0));
        b11.setText("2");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b12.setForeground(new java.awt.Color(153, 153, 0));
        b12.setText("3");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b13.setForeground(new java.awt.Color(153, 153, 0));
        b13.setText("-");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b14.setForeground(new java.awt.Color(153, 153, 0));
        b14.setText("0");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b15.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b15.setForeground(new java.awt.Color(153, 153, 0));
        b15.setText("ENTER");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b16.setForeground(new java.awt.Color(153, 153, 0));
        b16.setText(".");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b17.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        b17.setForeground(new java.awt.Color(153, 153, 0));
        b17.setText("+");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(b14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(249, 249, 249))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
String x,z;
	int y,c;
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       try{
			      t1.setText("");
			}
			catch(Exception e)
			{}
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       try
    {
                  String s1=t1.getText();							//int n1= Integer.parseInt(s1);
                  String s2 ="7";
                  if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
                  {
                          t1.setText(s2);

                  }	
                  else
                  {
                  String s3=s1.concat(s2);
                  t1.setText(s3);

                  //l4.setText(String.valueOf(n));
                  //l4.setText(n+"");
    }
    }
  catch(Exception re)
  {

  }
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
 try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="8";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
                                        {}
                                }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="9";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="4";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="5";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="6";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                  

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
             try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="1";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                   

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="2";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                   

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="3";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							
							t1.setText(s2);
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                   

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {                                    
      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="0";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                   

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        try
				  {
					  Float n;
					  z=t1.getText();
					 Float n1=Float.parseFloat(x);
					 	 Float n2=Float.parseFloat(z);
						  if(y==0)
						 {
							  n=n1/n2;
							 t1.setText(String.valueOf(n));
						 }
						 else if(y==1)
							 {
						       n=n1*n2;
							 t1.setText(String.valueOf(n));
							 }
							 else if(y==2)
								 {
									 			n=n1-n2;
							                     t1.setText(String.valueOf(n));
								 }
								 else
								 {
								   n=n1+n2;
							       t1.setText(String.valueOf(n));
							     }
							 }
						 
						catch(Exception re)
			{
				t1.setText(re.getMessage());
			}
    }                                   

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {                                    
 try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 =".";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}
    }                                   

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("/");
						String s1=t1.getText();
						y=0;
						String s2 ="/";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  
				catch(Exception re)
			{}
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("*");
						String s1=t1.getText();
						y=1;
						String s2 ="*";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  
				catch(Exception re)
			{}
    }                                  

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {                                    
   try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("-");
						String s1=t1.getText();
						y=2;
						String s2 ="-";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				catch(Exception re)
			{}
    }                                   

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {                                    
      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("+");
						String s1=t1.getText();
						 y=3;
						String s2 ="+";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  
				  }
				catch(Exception re)
			{}
    }                                   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel p1;
    private javax.swing.JTextField t1;
    // End of variables declaration                   
}
