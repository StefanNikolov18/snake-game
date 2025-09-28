package gamepages;

import java.awt.*;
import javax.swing.*;
import options.FrameDim;

    public class LoadingPage extends JPanel{
        

        public LoadingPage(){
            this.setPreferredSize(new Dimension(FrameDim.X_SIZE_FRAME,FrameDim.Y_SIZE_FRAME)); //800x600
            //this.setBackground(new Color(0,130,0)); //green background

            BackgroundImage = new ImageIcon("images/LoadingPage/DirtBackgroundLoading.jpg").getImage();
            LoadingImage = new ImageIcon("images/LoadingPage/loadingBar.png").getImage();
            snakeLoad = new ImageIcon("images/LoadingPage/snakeLoading.png").getImage();
            
        }

        
        public void paint(Graphics g){
            Graphics2D g2D = (Graphics2D) g;

            g2D.drawImage(BackgroundImage, 0, 0, null);
            g2D.drawImage(LoadingImage,185,250,null);
            g2D.drawImage(snakeLoad,75,75,null);


        }

        public JPanel getLoadingPanel(){
            return this;
        }

        //data
        private Image BackgroundImage;
        private Image LoadingImage;
        private Image snakeLoad;
    }
