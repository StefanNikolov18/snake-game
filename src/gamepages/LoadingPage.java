package gamepages;

import java.awt.*;
import javax.swing.*;
import options.FrameDim;

    public class LoadingPage extends JPanel{
        private Image BackgroundImage;
        private Image loadingImage;
        private JProgressBar loadingbar;



        public LoadingPage(){
            this.setPreferredSize(new Dimension(FrameDim.X_SIZE_FRAME,FrameDim.Y_SIZE_FRAME)); //800x600
            //this.setBackground(new Color(0,130,0)); //green background

            BackgroundImage = new ImageIcon("images/DirtBackgroundLoading.jpg").getImage();

            loadingbar = new JProgressBar();
            loadingbar.setBounds(0,0,420,50);
            loadingbar.setStringPainted(true);


            this.add(loadingbar);
        }

        @Override
        public void paint(Graphics g){
            super.paintComponent(g);
            Graphics2D g2D = (Graphics2D) g;

            g2D.drawImage(BackgroundImage, 0, 0, null);
        }

        public JPanel getLoadingPanel(){
            return this;
        }
    }
